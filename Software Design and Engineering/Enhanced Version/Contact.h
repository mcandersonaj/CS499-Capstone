#ifndef CONTACT_H
#define CONTACT_H

#include <string>
#include <stdexcept>

class Contact {
private:
    std::string contactId;
    std::string firstName;
    std::string lastName;
    std::string phone;
    std::string address;

    void validateString(const std::string& value, size_t maxLength, const std::string& fieldName);
    void validatePhone(const std::string& phone);

public:
    Contact(std::string contactId, std::string firstName, std::string lastName,
            std::string phone, std::string address);

    std::string getContactId() const;
    std::string getFirstName() const;
    std::string getLastName() const;
    std::string getPhone() const;
    std::string getAddress() const;

    void setFirstName(const std::string& firstName);
    void setLastName(const std::string& lastName);
    void setPhone(const std::string& phone);
    void setAddress(const std::string& address);
};

#endif
