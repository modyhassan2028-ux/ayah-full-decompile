package B5;

import android.view.View;
import android.widget.TextView;
import com.ayah.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final CircularProgressIndicator f634A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f635v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f637x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f638y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final View f639z;

    public e(View view) {
        super(view);
        this.f635v = view;
        View viewFindViewById = view.findViewById(R.id.title);
        j.d(viewFindViewById, "findViewById(...)");
        this.f636w = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        j.d(viewFindViewById2, "findViewById(...)");
        this.f637x = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.is_selected);
        j.d(viewFindViewById3, "findViewById(...)");
        this.f638y = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.needs_download);
        j.d(viewFindViewById4, "findViewById(...)");
        this.f639z = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.progress);
        j.d(viewFindViewById5, "findViewById(...)");
        this.f634A = (CircularProgressIndicator) viewFindViewById5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j.a(this.f635v, ((e) obj).f635v);
    }

    public final int hashCode() {
        return this.f635v.hashCode();
    }

    @Override // E2.F0
    public final String toString() {
        return "TafsirHolder(view=" + this.f635v + ")";
    }
}
