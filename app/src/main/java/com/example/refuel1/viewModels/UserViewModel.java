package com.example.refuel1.viewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.refuel1.dashboard.User;
import com.example.refuel1.repositories.ProfileRepository;

public class UserViewModel extends ViewModel {

    ProfileRepository repository = new ProfileRepository();
    public LiveData<Boolean> dataSavedSuccessfully;

    public LiveData<User> getResponseAsUserProfile(){
        //Log.d("UserViewModel",repository.getResponseFromDatabase().getValue().getEmail());
        return repository.getResponseFromDatabase();
    }
    public void saveUserDetailsAsProfile(User user){
        dataSavedSuccessfully = repository.saveUserData(user);
    }

}
