package pd.example.springmysqldockerimage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pd.example.springmysqldockerimage.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Long> {
}
