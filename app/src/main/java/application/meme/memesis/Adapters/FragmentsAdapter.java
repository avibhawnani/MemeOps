package application.meme.memesis.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import application.meme.memesis.Fragments.ChatsFragment;
import application.meme.memesis.Fragments.MemeFragment;
import application.meme.memesis.Fragments.NewsFeedFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:return new ChatsFragment();
            case 1:return new MemeFragment();
            case 2:return new NewsFeedFragment();
            default:return new ChatsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if(position==0){
            title="CHATS";
        }
        if(position==1){
            title="MEMES";
        }
        if(position==2){
            title="NEWSFEED";
        }
        return title;
    }
}
