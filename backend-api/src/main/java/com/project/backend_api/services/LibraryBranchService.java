package com.project.backend_api.services;

import com.project.backend_api.dto.LibraryBranchDTO;
import com.project.backend_api.models.Book;
import com.project.backend_api.models.LibraryBranch;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface LibraryBranchService {
    public Optional<LibraryBranchDTO> getLibraryBranchByName(String branchName);
    public List<LibraryBranchDTO> getAllLibraryBranches();
    public ResponseEntity<String> createLibraryBranch(LibraryBranch libraryBranch);
    public ResponseEntity<String> updateLibraryBranch(LibraryBranch libraryBranch);
    public ResponseEntity<String> deleteLibraryBranch(Long libraryBranchId);
}