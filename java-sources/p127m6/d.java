package p127m6;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.ayah.R;
import com.ayah.share.ShareActivity;
import java.util.ArrayList;
import p192t6.f;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ArrayAdapter {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ShareActivity f19631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f19632s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ShareActivity shareActivity, ArrayList arrayList, int i10) {
        super(shareActivity, R.layout.support_simple_spinner_dropdown_item, android.R.id.text1, arrayList);
        this.f19631r = shareActivity;
        this.f19632s = i10;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 + this.f19632s;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        j.e(viewGroup, "parent");
        View view2 = super.getView(i10, view, viewGroup);
        j.d(view2, "getView(...)");
        TextView textView = (TextView) view2.findViewById(android.R.id.text1);
        if (textView != null) {
            ShareActivity shareActivity = this.f19631r;
            textView.setTextSize(0, shareActivity.f13930f0);
            f.c(shareActivity, textView, false, true);
        }
        return view2;
    }
}
