package fr.free.nrw.commons.contributions;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import fr.free.nrw.commons.MediaWikiImageView;
import fr.free.nrw.commons.R;

class ContributionViewHolder {
    final MediaWikiImageView imageView;
    final ImageView contributionViewImage;
    final TextView titleView;
    final TextView stateView;
    final TextView seqNumView;
    final ProgressBar progressView;

    ContributionViewHolder(View parent) {
        imageView = (MediaWikiImageView) parent.findViewById(R.id.contributionImage);
        contributionViewImage = (ImageView) parent.findViewById(R.id.contributionViewImage);
        titleView = (TextView)parent.findViewById(R.id.contributionTitle);
        stateView = (TextView)parent.findViewById(R.id.contributionState);
        seqNumView = (TextView)parent.findViewById(R.id.contributionSequenceNumber);
        progressView = (ProgressBar)parent.findViewById(R.id.contributionProgress);
    }
}
