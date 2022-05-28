package com.example.swostiproject.network;

import android.content.Context;

import com.example.swostiproject.util.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkClient {

    private Retrofit mRetrofit;
    private Context mContext;
    private ApiClient mClient;
    private static Retrofit retrofit = null;

    public NetworkClient(Context mContext) {
        this.mRetrofit = getClient();
        this.mContext = mContext;
        mClient = mRetrofit.create(ApiClient.class);
    }

    public static Retrofit getClient() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit;
    }

    public Context getmContext() {
        return mContext;
    }


    public ApiClient getmClient() {
        return mClient;
    }

    /*public MutableLiveData<AddParkingResponseModel> saveParking(AddParkingModel mModel, Context mContex) {
        MutableLiveData<AddParkingResponseModel> mData = new MutableLiveData<>();
        getmClient().saveParking(mModel).enqueue(new Callback<AddParkingResponseModel>() {
            @Override
            public void onResponse(Call<AddParkingResponseModel> call, Response<AddParkingResponseModel> response) {
                if (response.isSuccessful()) {
                    if (response.body().getStatusCode().equals(Constants.SUCCESS))
                        mData.setValue(response.body());
                    else if(response.body().getStatusCode().equals(Constants.ERROR_401))
                        mData.setValue(response.body());

                }
            }

            @Override
            public void onFailure(Call<AddParkingResponseModel> call, Throwable t) {
                Toast.makeText(getmContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
            }
        });

        return mData;
    }*/
}
