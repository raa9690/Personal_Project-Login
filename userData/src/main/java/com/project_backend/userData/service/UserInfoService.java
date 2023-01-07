package main.java.com.project_backend.userData.service;

import main.java.com.project_backend.userData.model.UserInfo;
import main.java.com.project_backend.userData.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
@Transactional
public class UserInfoService {
    // a part of me doesn't like having access to a list of all user info, but i'm following a tutorial, 
    // so I'm going to keep this in before doing any reformating
    @Autowired
    private UserInfoRepository userInfoRepository;
    public List<UserInfo> listAllUserInfo() {
        return userInfoRepository.findAll();
    }

    public void saveUserInfo(UserInfo userInfo) {
        userInfoRepository.save(userInfo);
    }

    public UserInfo getUserInfo(Integer id) {
        return userInfoRepository.findById(id).get();
    }

    public void deleteUserInfo(Integer id) {
        userInfoRepository.deleteById(id);
    }
}