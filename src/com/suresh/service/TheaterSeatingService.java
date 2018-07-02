package com.suresh.service;

import java.util.List;

import com.suresh.model.TheaterLayout;
import com.suresh.model.TheaterRequest;

public interface TheaterSeatingService {
    
    TheaterLayout getTheaterLayout(String rawLayout);
    
    List<TheaterRequest> getTicketRequests(String ticketRequests);
    
    void processTicketRequests(TheaterLayout layout, List<TheaterRequest> requests);

}
