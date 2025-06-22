#include "ContactService.h"
#include <gtest/gtest.h>

TEST(ContactServiceTest, AddAndDeleteContact) {
    ContactService service;
    Contact c("999", "Test", "User", "1234567890", "Somewhere");
    service.addContact(c);
    EXPECT_EQ(service.getContacts().size(), 1);
    service.deleteContact("999");
    EXPECT_EQ(service.getContacts().size(), 0);
}

TEST(ContactServiceTest, AddDuplicateThrows) {
    ContactService service;
    Contact c("abc", "One", "User", "1234567890", "Place");
    service.addContact(c);
    EXPECT_THROW(service.addContact(c), std::invalid_argument);
}

TEST(ContactServiceTest, UpdateContact) {
    ContactService service;
    Contact c("42", "Jane", "Doe", "1111111111", "Old Addr");
    service.addContact(c);

    service.updateAddress("42", "New Addr");
    EXPECT_EQ(service.getContacts()[0].getAddress(), "New Addr");
}
