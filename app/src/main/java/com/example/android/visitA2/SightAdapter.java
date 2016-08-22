package com.example.android.visitA2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Adapter that attaches an {@link ArrayList} of {@link Sight} objects to a {@link RecyclerView}
 */
public class SightAdapter extends RecyclerView.Adapter<SightAdapter.ViewHolder> {

    /**
     * Object that works as a placeholder for all the views of the
     * {@link android.support.v7.widget.CardView} used to display the information for a sight
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {

        /**
         * The {@link TextView} with the name of the Sight
         */
        public TextView mNameText;
        /**
         * The {@link TextView} with the description of th sight
         */
        public TextView mDescriptionText;
        /**
         * The {@link ImageView} with the photo of the sight
         */
        public ImageView mSightImage;
        /**
         * The Website {@link Button} for the sight
         */
        public Button mWebsiteButton;
        /**
         * The Map {@link Button} for the sight
         */
        public Button mMapButton;

        /**
         * Public constructor for the class
         *
         * @param view The parent {@link View} that containf all the elements of the
         *             {@link ViewHolder}
         */
        public ViewHolder(View view) {
            super(view);
            mNameText = (TextView) view.findViewById(R.id.name_text);
            mDescriptionText = (TextView) view.findViewById(R.id.description_text);
            mSightImage = (ImageView) view.findViewById(R.id.sight_image);
            mWebsiteButton = (Button) view.findViewById(R.id.website_button);
            mMapButton = (Button) view.findViewById(R.id.map_button);
        }
    }

    /**
     * An {@link android.view.View.OnClickListener} that creates an {@link Intent} that opens
     * a provided website
     */
    private static class ButtonClickToWeb implements View.OnClickListener {

        // Context variable
        private Context mContext;
        // The URL for the website that must be opened when a click is detected
        private String mUrl;

        /**
         * Public constructor of the class
         *
         * @param context The context of the activity that uses the object
         * @param url     The URL for the website that must be opened when a click is detected
         */
        public ButtonClickToWeb(Context context, String url) {
            this.mContext = context;
            this.mUrl = url;
        }

        @Override
        public void onClick(View view) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW);
            webIntent.setData(Uri.parse(this.mUrl));
            this.mContext.startActivity(webIntent);
        }
    }

    // Context variable
    private Context mContext;
    // The ArrayList of Sight objects that are going to be displayed by the adapter in its
    // attached RecyclerView.
    private ArrayList<Sight> mSightList;

    /**
     * Public constructor for the class
     *
     * @param context   The context of the activity that uses the object
     * @param sightList The {@link ArrayList} of {@link Sight} objects that are going to be
     *                  displayed by the adapter in its attached {@link RecyclerView}
     */
    public SightAdapter(Context context, ArrayList<Sight> sightList) {
        mContext = context;
        mSightList = sightList;
    }

    /**
     * Creates a new {@link android.support.v7.widget.CardView} if necessary
     *
     * @param parent   the parent {@link View} for the View to be created
     * @param viewType the type of the new view
     * @return The {@link ViewHolder} with all the child Views of the created {@link android.support.v7.widget.CardView}
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate the corresponding layout
        View sightCard = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sight_card, parent, false);
        return new ViewHolder(sightCard);
    }

    /**
     * Called by {@link RecyclerView} to display the data at the specified position
     *
     * @param holder   The {@link ViewHolder} to be updated
     * @param position The position in the {@link ArrayList} of the items whose information must
     *                 be displayed
     */
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Get the current sight object at the given position
        Sight currentSight = mSightList.get(position);

        // Update the components of the ViewHolder with the information of the current sight
        holder.mNameText.setText(currentSight.getName());
        holder.mDescriptionText.setText(currentSight.getDescription());
        holder.mSightImage.setImageDrawable(mContext.getResources().getDrawable(currentSight.getImgResId()));
        holder.mWebsiteButton.setOnClickListener(new ButtonClickToWeb(mContext,
                currentSight.getWebsite()));
        holder.mMapButton.setOnClickListener(new ButtonClickToWeb(mContext,
                currentSight.getMapWebsite()));

    }

    /**
     * Gives the number of objects that must be included in the {@link RecyclerView}
     *
     * @return The number  of elements in the {@link RecyclerView}
     */
    @Override
    public int getItemCount() {
        return mSightList.size();
    }
}
