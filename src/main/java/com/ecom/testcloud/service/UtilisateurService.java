package com.ecom.testcloud.service;

import com.ecom.testcloud.entities.Utilisateur;
import com.ecom.testcloud.repository.UtilisateurRepository;
import com.ecom.testcloud.response.MessageResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;


    public ResponseEntity<?> inscription(Utilisateur utilisateur){
        utilisateur = this.utilisateurRepository.save(utilisateur);

        return ResponseEntity.ok(new MessageResponse("Compte utilisateur crée avec succés!"));

    }
}
