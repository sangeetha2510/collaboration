package com.sangi.dao;

import com.sangi.model.ProfilePicture;

public interface ProfilePictureDao {
void uploadProfilePicture(ProfilePicture profilePicture);
ProfilePicture getProfilePicture(String email);
}
