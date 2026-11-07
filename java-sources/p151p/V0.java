package p151p;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f20604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f20605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f20606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f20607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f20608e;

    public V0(View view) {
        this.f20604a = (TextView) view.findViewById(R.id.text1);
        this.f20605b = (TextView) view.findViewById(R.id.text2);
        this.f20606c = (ImageView) view.findViewById(R.id.icon1);
        this.f20607d = (ImageView) view.findViewById(R.id.icon2);
        this.f20608e = (ImageView) view.findViewById(com.ayah.R.id.edit_query);
    }
}
