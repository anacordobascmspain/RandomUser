package randomuser.com.data.agent;

import randomuser.com.data.repository.UserRepository;
import rx.Observable;

public class DeleteUserAgentImp implements com.domain.usecases.DeleteUserAgent {
  private UserRepository userRepository;

  public DeleteUserAgentImp(UserRepository userRepository) {
    this.userRepository = userRepository;
  }


  @Override
  public Observable<Boolean> deleteUser(String nameUser, String surname, String email) {
    return userRepository.deleteUser(nameUser,surname,email);
  }
}