package N5;

import E2.AbstractC0115c0;
import E2.F0;
import F9.n;
import K0.C0362p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ayah.R;
import com.ayah.feature.reciterlist.qari.QariAudioActivity;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.util.ArrayList;
import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0115c0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f6033A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final b f6034B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final b f6035C;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final QariAudioActivity f6036u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0362p f6037v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0362p f6038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0362p f6039x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0362p f6040y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LayoutInflater f6041z;

    public c(QariAudioActivity qariAudioActivity, C0362p c0362p, C0362p c0362p2, C0362p c0362p3, C0362p c0362p4) {
        this.f6036u = qariAudioActivity;
        this.f6037v = c0362p;
        this.f6038w = c0362p2;
        this.f6039x = c0362p3;
        this.f6040y = c0362p4;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(qariAudioActivity);
        j.d(layoutInflaterFrom, "from(...)");
        this.f6041z = layoutInflaterFrom;
        this.f6033A = new ArrayList();
        this.f6034B = new b(this, 1);
        this.f6035C = new b(this, 0);
    }

    @Override // E2.AbstractC0115c0
    public final int a() {
        return this.f6033A.size();
    }

    @Override // E2.AbstractC0115c0
    public final int c(int i10) {
        O5.d dVar = (O5.d) this.f6033A.get(i10);
        if (dVar instanceof O5.b) {
            return 0;
        }
        if (dVar instanceof O5.a) {
            return 1;
        }
        if (dVar instanceof O5.c) {
            return 2;
        }
        throw new A6.a();
    }

    @Override // E2.AbstractC0115c0
    public final void e(F0 f3, int i10) {
        g gVar = (g) f3;
        boolean z10 = gVar instanceof e;
        ArrayList arrayList = this.f6033A;
        if (z10) {
            Object obj = arrayList.get(i10);
            j.c(obj, "null cannot be cast to non-null type com.ayah.feature.reciterlist.qari.model.QariAudioRow.QariInfoRow");
            TextView textView = ((e) gVar).f6043v;
            p065g3.a aVar = ((O5.b) obj).f6494a;
            textView.setText(p125m4.b.b() ? aVar.f16279h : aVar.f16280i);
            return;
        }
        if (gVar instanceof d) {
            Object obj2 = arrayList.get(i10);
            j.c(obj2, "null cannot be cast to non-null type com.ayah.feature.reciterlist.qari.model.QariAudioRow.JuzRow");
            ((d) gVar).f6042v.setText(this.f6036u.getString(R.string.part, Integer.valueOf(((O5.a) obj2).f6493a)));
            return;
        }
        if (!(gVar instanceof f)) {
            throw new A6.a();
        }
        Object obj3 = arrayList.get(i10);
        j.c(obj3, "null cannot be cast to non-null type com.ayah.feature.reciterlist.qari.model.QariAudioRow.SuraRow");
        O5.c cVar = (O5.c) obj3;
        n nVar = cVar.f6497c;
        f fVar = (f) gVar;
        ImageView imageView = fVar.f6046x;
        View view = fVar.f6045w;
        CircularProgressIndicator circularProgressIndicator = fVar.f6047y;
        fVar.f6044v.setText(cVar.f6495a.b());
        if (nVar instanceof p088i3.c) {
            view.setVisibility(8);
            return;
        }
        if (nVar instanceof p088i3.d) {
            view.setVisibility(0);
            imageView.setVisibility(0);
            circularProgressIndicator.setVisibility(8);
            imageView.setTag(Integer.valueOf(i10));
            return;
        }
        boolean z11 = nVar instanceof p088i3.a;
        if (!z11 && !nVar.equals(p088i3.b.f16738f)) {
            throw new A6.a();
        }
        view.setVisibility(0);
        imageView.setVisibility(8);
        circularProgressIndicator.setVisibility(0);
        if (z11) {
            circularProgressIndicator.setProgressCompat(((p088i3.a) nVar).f16737f, true);
        } else {
            circularProgressIndicator.setProgressCompat(0, true);
        }
        circularProgressIndicator.setTag(Integer.valueOf(i10));
    }

    @Override // E2.AbstractC0115c0
    public final void f(F0 f3, int i10, List list) {
        g gVar = (g) f3;
        j.e(list, "payloads");
        if (!list.contains("DownloadStatus")) {
            e(gVar, i10);
            return;
        }
        f fVar = (f) gVar;
        CircularProgressIndicator circularProgressIndicator = fVar.f6047y;
        Object obj = this.f6033A.get(i10);
        j.c(obj, "null cannot be cast to non-null type com.ayah.feature.reciterlist.qari.model.QariAudioRow.SuraRow");
        p088i3.a aVar = (p088i3.a) ((O5.c) obj).f6497c;
        fVar.f6045w.setVisibility(0);
        fVar.f6046x.setVisibility(8);
        circularProgressIndicator.setVisibility(0);
        circularProgressIndicator.setProgressCompat(aVar.f16737f, true);
        circularProgressIndicator.setTag(Integer.valueOf(i10));
    }

    @Override // E2.AbstractC0115c0
    public final F0 g(ViewGroup viewGroup, int i10) {
        int i11;
        F0 eVar;
        if (i10 != 0) {
            i11 = i10 != 1 ? R.layout.qari_audio_row_sura : R.layout.qari_audio_row_category;
        } else {
            i11 = R.layout.qari_audio_row_info;
        }
        View viewInflate = this.f6041z.inflate(i11, viewGroup, false);
        int i12 = g.f6048u;
        j.b(viewInflate);
        if (i10 == 0) {
            eVar = new e(viewInflate);
        } else if (i10 == 1) {
            eVar = new d(viewInflate);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Invalid qari audio row type.");
            }
            eVar = new f(viewInflate);
        }
        if (eVar instanceof f) {
            f fVar = (f) eVar;
            fVar.f6046x.setOnClickListener(this.f6034B);
            fVar.f6047y.setOnClickListener(this.f6035C);
        }
        return eVar;
    }
}
