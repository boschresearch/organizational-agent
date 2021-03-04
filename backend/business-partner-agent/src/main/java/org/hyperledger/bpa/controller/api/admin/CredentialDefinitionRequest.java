package org.hyperledger.bpa.controller.api.admin;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CredentialDefinitionRequest {
    private String label;
    private String credentialDefinitionId;
}