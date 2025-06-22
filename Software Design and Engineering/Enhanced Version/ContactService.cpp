#include "ContactService.h"

void ContactService::addContact(const Contact& contact) {
    for (const auto& c : contactList) {
        if (c.getContactId() == contact.getContactId()) {
            throw std::invalid_argument("Contact ID must be unique");
        }
    }
    contactList.push_back(contact);
}

void ContactService::deleteContact(const std::string& contactId) {
    for (auto it = contactList.begin(); it != contactList.end(); ++it) {
        if (it->getContactId() == contactId) {
            contactList.erase(it);
            return;
        }
    }
    throw std::invalid_argument("Contact with ID " + contactId + " not found");
}

Contact* ContactService::findContactById(const std::string& contactId) {
    for (auto& contact : contactList) {
        if (contact.getContactId() == contactId) {
            return &contact;
        }
    }
    throw std::invalid_argument("Contact with ID " + contactId + " not found");
}

void ContactService::updateFirstName(const std::string& contactId, const std::string& newFirstName) {
    findContactById(contactId)->setFirstName(newFirstName);
}

void ContactService::updateLastName(const std::string& contactId, const std::string& newLastName) {
    findContactById(contactId)->setLastName(newLastName);
}

void ContactService::updatePhone(const std::string& contactId, const std::string& newPhone) {
    findContactById(contactId)->setPhone(newPhone);
}

void ContactService::updateAddress(const std::string& contactId, const std::string& newAddress) {
    findContactById(contactId)->setAddress(newAddress);
}

const std::vector<Contact>& ContactService::getContacts() const {
    return contactList;
}
