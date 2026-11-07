package p035d3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.ayah.AboutActivity;
import com.ayah.R;
import p017b7.d;

/* JADX INFO: renamed from: d3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0920b extends BaseAdapter {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d[] f15594r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LayoutInflater f15595s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f15596t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f15597u;

    public C0920b(AboutActivity aboutActivity) {
        d dVar = new d();
        dVar.f13308a = R.string.rate_ayah;
        int i10 = aboutActivity.S;
        dVar.f13309b = 2131230886;
        dVar.f13310c = i10;
        d dVar2 = new d(dVar);
        d dVar3 = new d();
        dVar3.f13308a = R.string.share_ayah;
        dVar3.f13309b = 2131230887;
        dVar3.f13310c = aboutActivity.T;
        d dVar4 = new d(dVar3);
        d dVar5 = new d();
        dVar5.f13308a = R.string.contact_us;
        dVar5.f13309b = 2131230888;
        dVar5.f13310c = aboutActivity.U;
        d dVar6 = new d(dVar5);
        d dVar7 = new d();
        dVar7.f13308a = R.string.follow_us;
        dVar7.f13309b = 2131230945;
        dVar7.f13310c = aboutActivity.f13602V;
        this.f15594r = new d[]{dVar2, dVar4, dVar6, new d(dVar7)};
        this.f15595s = LayoutInflater.from(aboutActivity);
        this.f15596t = R.drawable.list_selector;
        this.f15597u = aboutActivity.getColor(R.color.text);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f15594r.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        return this.f15594r[i10];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        d[] dVarArr = this.f15594r;
        d dVar = dVarArr[i10];
        LayoutInflater layoutInflater = this.f15595s;
        if (dVar == null) {
            return view == null ? layoutInflater.inflate(R.layout.about_gap, viewGroup, false) : view;
        }
        if (view == null) {
            view = layoutInflater.inflate(R.layout.about_item, viewGroup, false);
            C0921c c0921c = new C0921c(view);
            view.setTag(c0921c);
            c0921c.f15598a.setTextColor(this.f15597u);
        }
        C0921c c0921c2 = (C0921c) view.getTag();
        d dVar2 = dVarArr[i10];
        TextView textView = c0921c2.f15598a;
        ImageView imageView = c0921c2.f15599b;
        int i11 = dVar2.f13308a;
        int i12 = dVar2.f13309b;
        textView.setText(i11);
        if (i12 == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(i12);
            int i13 = dVar2.f13310c;
            if (i13 != 0) {
                imageView.setColorFilter(i13);
            }
        }
        view.setBackgroundResource(this.f15596t);
        return view;
    }
}
