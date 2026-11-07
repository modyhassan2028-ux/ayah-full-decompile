package J5;

import E2.AbstractC0115c0;
import E2.F0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.R;
import com.ayah.feature.reciterlist.RecitersActivity;
import java.util.ArrayList;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0115c0 implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final E5.b f4327A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RecitersActivity f4328u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RecyclerView f4329v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final I5.b f4330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final I5.b f4331x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LayoutInflater f4332y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f4333z;

    public a(RecitersActivity recitersActivity, RecyclerView recyclerView, I5.b bVar, I5.b bVar2) {
        this.f4328u = recitersActivity;
        this.f4329v = recyclerView;
        this.f4330w = bVar;
        this.f4331x = bVar2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(recitersActivity);
        j.d(layoutInflaterFrom, "from(...)");
        this.f4332y = layoutInflaterFrom;
        this.f4333z = new ArrayList();
        this.f4327A = new E5.b(2, this);
    }

    @Override // E2.AbstractC0115c0
    public final int a() {
        return this.f4333z.size();
    }

    @Override // E2.AbstractC0115c0
    public final int c(int i10) {
        K5.c cVar = (K5.c) this.f4333z.get(i10);
        if (cVar instanceof K5.a) {
            return 0;
        }
        if (cVar instanceof K5.b) {
            return 1;
        }
        throw new A6.a();
    }

    @Override // E2.AbstractC0115c0
    public final void e(F0 f3, int i10) {
        e eVar = (e) f3;
        boolean z10 = eVar instanceof c;
        ArrayList arrayList = this.f4333z;
        if (z10) {
            Object obj = arrayList.get(i10);
            j.c(obj, "null cannot be cast to non-null type com.ayah.feature.reciterlist.model.ReciterRow.Category");
            ((c) eVar).f4340v.setText(((K5.a) obj).f5242a.f4337s);
            return;
        }
        if (!(eVar instanceof d)) {
            throw new A6.a();
        }
        Object obj2 = arrayList.get(i10);
        j.c(obj2, "null cannot be cast to non-null type com.ayah.feature.reciterlist.model.ReciterRow.Reciter");
        K5.b bVar = (K5.b) obj2;
        boolean z11 = bVar.f5244b;
        p065g3.a aVar = bVar.f5243a;
        d dVar = (d) eVar;
        ImageView imageView = dVar.f4344y;
        ImageView imageView2 = dVar.f4341v;
        TextView textView = dVar.f4343x;
        dVar.f4342w.setText(aVar.a());
        String str = p125m4.b.b() ? aVar.f16278f : aVar.g;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        imageView2.setImageResource(z11 ? 2131230893 : 2131230892);
        int i11 = z11 ? R.color.grouped_accessory : R.color.tertiary_background;
        RecitersActivity recitersActivity = this.f4328u;
        imageView2.setColorFilter(recitersActivity.getColor(i11));
        imageView.setColorFilter(recitersActivity.getColor(R.color.tint));
        imageView.setOnClickListener(this.f4327A);
    }

    @Override // E2.AbstractC0115c0
    public final F0 g(ViewGroup viewGroup, int i10) {
        View viewInflate = this.f4332y.inflate(i10 == 0 ? R.layout.reciters_row_category : R.layout.reciters_row_reciter, viewGroup, false);
        viewInflate.setOnClickListener(this);
        int i11 = e.f4345u;
        if (i10 == 0) {
            return new c(viewInflate);
        }
        if (i10 == 1) {
            return new d(viewInflate);
        }
        throw new IllegalStateException("Invalid reciter row type.");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j.e(view, "v");
        this.f4329v.getClass();
        int iN = RecyclerView.N(view);
        if (iN != -1) {
            Object obj = this.f4333z.get(iN);
            K5.b bVar = obj instanceof K5.b ? (K5.b) obj : null;
            if (bVar != null) {
                this.f4330w.e(bVar.f5243a);
            }
        }
    }
}
