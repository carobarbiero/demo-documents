package com.carob.demodocuments.repository;

import com.carob.demodocuments.model.Document;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {

    List<Document> findByAccountId(Long accountId);
}
