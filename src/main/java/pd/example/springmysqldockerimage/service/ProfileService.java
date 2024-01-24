package pd.example.springmysqldockerimage.service;

import pd.example.springmysqldockerimage.model.Profile;

import java.util.List;

public interface ProfileService {
    void save(Profile profile);

    List<Profile> findAll();
}
