#include "Contact.h"
#include "ContactService.h"
#include <iostream>

void testContactCreation() {
    try {
        Contact c("1234567890", "John", "Doe", "1234567890", "123 Street");
        std::cout << "Contact created successfully: " << c.getFirstName() << " " << c.getLastName() << std::endl;
    } catch (const std::exception& e) {
        std::cerr << "Contact creation failed: " << e.what() << std::endl;
    }
}

void testContactServiceAddAndDelete() {
    ContactService service;

    try {
        Contact c("111", "Jane", "Smith", "0987654321", "456 Avenue");
        service.addContact(c);
        std::cout << "Contact added." << std::endl;

        service.deleteContact("111");
        std::cout << "Contact deleted successfully." << std::endl;
    } catch (const std::exception& e) {
        std::cerr << "Test failed: " << e.what() << std::endl;
    }
}

void testInvalidPhone() {
    try {
        Contact c("222", "Bad", "Phone", "123", "Invalid Address");
    } catch (const std::exception& e) {
        std::cout << "Caught expected error: " << e.what() << std::endl;
    }
}

int main() {
    testContactCreation();
    testContactServiceAddAndDelete();
    testInvalidPhone();
    return 0;
}
