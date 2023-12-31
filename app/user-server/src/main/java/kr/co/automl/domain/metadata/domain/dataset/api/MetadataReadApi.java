package kr.co.automl.domain.metadata.domain.dataset.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.automl.domain.metadata.domain.dataset.service.MetadataReader;
import kr.co.automl.domain.metadata.dto.MetadataResponse;
import kr.co.automl.global.utils.web.dto.ListToDataResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MetadataReadApi {

    private final MetadataReader metadataReader;

    @GetMapping("/metadata")
    public ListToDataResponse<MetadataResponse> getAllMetadata() {
        List<MetadataResponse> metadataResponses = metadataReader.readAll();

        return new ListToDataResponse<>(metadataResponses);
    }

}
