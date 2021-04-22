package com.dolbunmark.repository;


import com.dolbunmark.domain.Ticket;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TicketRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public TicketRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Ticket> getAllTicket() {
        Query query = sessionFactory.getCurrentSession().createQuery("FROM Ticket", Ticket.class);
        return query.list();
    }

    public Ticket getTicketById(int id) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Ticket p where p.id = :id");
        query.setParameter("id", id);
        return (Ticket) query.getSingleResult();
    }
}
