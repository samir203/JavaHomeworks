package Abstract;

import Entities.User;

public interface UserService {
	
	void save(User user);
	void updateData(User user);
	void deleteData(User user);

}
