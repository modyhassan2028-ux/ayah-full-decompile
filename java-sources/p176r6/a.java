package p176r6;

import E2.AbstractC0115c0;
import E2.F0;
import android.view.View;
import android.view.ViewGroup;
import com.ayah.MainActivity;
import com.ayah.feature.quran.view.QuranPage;
import com.ayah.feature.tafsir.view.TafsirPage;
import i7.B;
import i7.D;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0115c0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MainActivity f21573u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f21574v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p201u6.a f21575w;

    public a(MainActivity mainActivity, int i10) {
        this.f21573u = mainActivity;
        this.f21575w = i10 == 1 ? new D(13) : new B(14);
        this.f21574v = i10;
    }

    @Override // E2.AbstractC0115c0
    public final int a() {
        return 604;
    }

    @Override // E2.AbstractC0115c0
    public final int c(int i10) {
        return this.f21574v - 1;
    }

    @Override // E2.AbstractC0115c0
    public final void e(F0 f3, int i10) {
        View view = ((b) f3).f1486a;
        j.d(view, "itemView");
        if (view instanceof QuranPage) {
            ((QuranPage) view).setPage(i10 + 1);
        } else if (view instanceof TafsirPage) {
            ((TafsirPage) view).setPage(i10 + 1);
        }
    }

    @Override // E2.AbstractC0115c0
    public final F0 g(ViewGroup viewGroup, int i10) {
        p201u6.a aVar = this.f21575w;
        MainActivity mainActivity = this.f21573u;
        j.c(mainActivity, "null cannot be cast to non-null type com.ayah.ui.controller.AudioController");
        View viewG = aVar.g(mainActivity, mainActivity);
        viewG.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new b(viewG);
    }
}
