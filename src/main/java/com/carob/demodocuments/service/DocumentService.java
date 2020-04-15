package com.carob.demodocuments.service;

import com.carob.demodocuments.model.Document;
import com.carob.demodocuments.repository.DocumentRepository;
import com.carob.demodocuments.vo.DocumentToRequireDTO;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocumentService {

    private final DocumentRepository documentRepository;

    public List<DocumentToRequireDTO> getDocumentsToRequire(Long accountId) {

        List<DocumentToRequireDTO> documents = documentRepository
                .findByAccountId(accountId)
                .stream()
                .map(document -> createDocumentToRequire(document))
                .collect(Collectors.toList());

        if (documents.isEmpty()) {
            throw new RuntimeException("Error: La cuenta no tiene documentos");
        }
        return documents;
    }

    private DocumentToRequireDTO createDocumentToRequire(Document document) {
        DocumentToRequireDTO documentDto = new DocumentToRequireDTO();
        documentDto.setAccountId(document.getAccountId());
        documentDto.setDocumentId(document.getDocumentId());
        documentDto.setDocumentTypeId(document.getDocumentType().getTypeId());
        documentDto.setDocumentTypeCode(document.getDocumentType().getTypeCode());
        documentDto.setDocumentTypeDescription(document.getDocumentType().getTypeDescripcion());

        documentDto.setDocumentStatusDescription("Estado logica en la vista");
        documentDto.setMandatory(Boolean.TRUE); //??? logica en la vista
        return documentDto;
    }
}
