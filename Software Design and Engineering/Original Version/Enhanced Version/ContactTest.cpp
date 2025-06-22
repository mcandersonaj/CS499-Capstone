#include "Contact.h"
#include <gtest/gtest.h>

TEST(ContactTest, ValidContactCreation) {
    Contact c("1234567890", "John", "Doe", "1234567890", "123 Street");
    EXPECT_EQ(c.getFirstName(), "John");
    EXPECT_EQ(c.getPhone(), "1234567890");
}

TEST(ContactTest, InvalidPhoneThrows) {
    EXPECT_THROW(Contact("1", "John", "Doe", "123", "123 Street"), std::invalid_argument);
}

TEST(ContactTest, SettersWorkCorrectly) {
    Contact c("1", "Jane", "Smith", "1234567890", "Home");
    c.setFirstName("Alice");
    c.setPhone("0987654321");
    EXPECT_EQ(c.getFirstName(), "Alice");
    EXPECT_EQ(c.getPhone(), "0987654321");
}
