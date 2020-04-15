package com.carob.demodocuments.service

import com.carob.demodocuments.vo.DocumentToRequireDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class DocumentServiceSpec extends Specification {

    @Autowired
    DocumentService documentService;
    
    
    def "get documents to require by id (ok response)"() {
        given:
        long accountId = 100

        when:
        def documents = documentService.getDocumentsToRequire(accountId)
        
        then:
        documents != null
        documents as List<DocumentToRequireDTO>
        documents.size() > 0
    }
}
