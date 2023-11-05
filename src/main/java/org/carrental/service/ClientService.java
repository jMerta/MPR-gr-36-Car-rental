package org.carrental.service;

import org.carrental.model.client.Client;

public interface ClientService {
    Client getById(Integer clientId);
}
