package com.tutorialsbuzz.recyclerview.TabFragments;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tutorialsbuzz.recyclerview.R;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    private TextView name_TextView;
    private TextView iso_TextView;

    public ItemViewHolder(View itemView) {
        super(itemView);
        name_TextView = (TextView) itemView.findViewById(R.id.country_name);
        iso_TextView = (TextView) itemView.findViewById(R.id.country_iso);

    }

    public void bind(CountryModel countryModel) {
        name_TextView.setText(countryModel.getName());
        iso_TextView.setText(countryModel.getisoCode());
    }
}
