#ifndef CONTACTSERVICE_H
#define CONTACTSERVICE_H

#include "Contact.h"
#include <vector>
#include <string>
#include <stdexcept>

class ContactService {
private:
    std::vector<Contact> contactList;

    Contact* findContactById(const std::string& contactId);

public:
    void addContact(const Contact& contact);
    void deleteContact(const std::string& contactId);
    void updateFirstName(const std::string& contactId, const std::string& newFirstName);
    void updateLastName(const std::string& contactId, const std::string& newLastName);
    void updatePhone(const std::string& contactId, const std::string& newPhone);
    void updateAddress(const std::string& contactId, const std::string& newAddress);

    const std::vector<Contact>& getContacts() const;
};

#endif
