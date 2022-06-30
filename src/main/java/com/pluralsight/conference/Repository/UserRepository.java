package com.pluralsight.conference.Repository;

import com.pluralsight.conference.model.User;

public interface UserRepository {
    User save(User user);
}
