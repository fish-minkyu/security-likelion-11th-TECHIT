package com.example.security.strategyPattern;

import com.example.security.strategyPattern.IUserService;
import org.springframework.stereotype.Service;

// Impl은 구현체란 의미
@Service
public class UserServiceImpl implements IUserService {
  @Override
  public void createUser() {

  }

  @Override
  public void readUser() {

  }

  @Override
  public void updateUser() {

  }
}
