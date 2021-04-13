package asg.concert.service.mapper;
import asg.concert.common.dto.UserDTO;
import asg.concert.service.domain.User;

public class UserMapper {
    static User toDomainModel(UserDTO userDTO) {
        User user = new User(userDTO.getUsername(),
                userDTO.getPassword());
        return user;
    }

    static UserDTO toDto(User user) {
        UserDTO userDto=
                new UserDTO(
                        user.getUsername(),
                        user.getPassword());
        return userDto;
    }
}
