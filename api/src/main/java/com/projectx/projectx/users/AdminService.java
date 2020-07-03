package com.projectx.projectx.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {

    private AdminRepository adminRepository;

    public AdminModel createAdmin(AdminModel adminModel){
        return adminRepository.save(adminModel);
    }


}
