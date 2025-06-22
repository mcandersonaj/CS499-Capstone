#include "Contact.h"

void Contact::validateString(const std::string& value, size_t maxLength, const std::string& fieldName) {
    if (value.empty()) {
        throw std::invalid_argument(fieldName + " cannot be null or empty");
    }
    if (value.length() > maxLength) {
        throw std::invalid_argument(fieldName + " cannot be longer than " + std::to_string(maxLength) + " characters");
    }
}

void Contact::validatePhone(const std::string& phone) {
    if (phone.length() != 10) {
        throw std::invalid_argument("Phone number must be exactly 10 digits");
    }
    for (char c : phone) {
        if (!isdigit(c)) {
            throw std::invalid_argument("Phone number must contain only digits");
        }
    }
}

Contact::Contact(std::string contactId, std::string firstName, std::string lastName,
                 std::string phone, std::string address) {
    validateString(contactId, 10, "Contact ID");
    validateString(firstName, 10, "First Name");
    validateString(lastName, 10, "Last Name");
    validatePhone(phone);
    validateString(address, 30, "Address");

    this->contactId = contactId;
    this->firstName = firstName;
    this->lastName = lastName;
    this->phone = phone;
    this->address = address;
}

std::string Contact::getContactId() const { return contactId; }
std::string Contact::getFirstName() const { return firstName; }
std::string Contact::getLastName() const { return lastName; }
std::string Contact::getPhone() const { return phone; }
std::string Contact::getAddress() const { return address; }

void Contact::setFirstName(const std::string& firstName) {
    validateString(firstName, 10, "First Name");
    this->firstName = firstName;
}

void Contact::setLastName(const std::string& lastName) {
    validateString(lastName, 10, "Last Name");
    this->lastName = lastName;
}

void Contact::setPhone(const std::string& phone) {
    validatePhone(phone);
    this->phone = phone;
}

void Contact::setAddress(const std::string& address) {
    validateString(address, 30, "Address");
    this->address = address;
}
