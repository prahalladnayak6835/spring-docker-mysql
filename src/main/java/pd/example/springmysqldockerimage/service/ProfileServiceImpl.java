package pd.example.springmysqldockerimage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pd.example.springmysqldockerimage.model.Profile;
import pd.example.springmysqldockerimage.repository.ProfileRepository;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService{
    @Autowired
    public ProfileRepository profileRepository;
    @Override
    public void save(Profile profile) {
        profileRepository.save(profile);

    }

    @Override
    public List<Profile> findAll() {
        return profileRepository.findAll();
    }
}
