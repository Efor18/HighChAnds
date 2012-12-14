package com.efor18.chartstest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.actionbarsherlock.app.SherlockFragment;
import com.efor18.chartstest.dummy.DummyContent;

/**
 * A fragment representing a single Chart detail screen.
 * This fragment is either contained in a {@link ChartListActivity}
 * in two-pane mode (on tablets) or a {@link ChartDetailActivity}
 * on handsets.
 */
public class ChartDetailFragment extends SherlockFragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ChartDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
        	mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	View rootView = inflater.inflate(R.layout.fragment_chart_detail, container, false);

    	// Show the dummy content as text in a TextView.
    	if (mItem != null) {
    		WebView wv =  ((WebView) rootView.findViewById(R.id.chart_detail));
    		wv.getSettings().setJavaScriptEnabled(true);
    		wv.getSettings().setRenderPriority(RenderPriority.HIGH);
    		wv.setWebChromeClient(new WebChromeClient());
    		wv.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
    		wv.setWebViewClient(new WebViewClient(){
    			public boolean shouldOverrideUrlLoading(WebView view, String url) {
    				return true;
    			}
        	});
    		wv.requestFocusFromTouch();

           wv.loadUrl("file:///android_asset/html/" +  mItem.fileName);
        }

        return rootView;
    }
}
