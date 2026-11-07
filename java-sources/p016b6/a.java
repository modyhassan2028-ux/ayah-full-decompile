package p016b6;

import C6.b;
import E2.InterfaceC0143q0;
import E5.c;
import K0.C0362p;
import W3.e;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0143q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0362p f13304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0362p f13305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f13306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p248z6.c f13307d;

    public a(Context context, C0362p c0362p, C0362p c0362p2, c cVar) {
        this.f13304a = c0362p;
        this.f13305b = c0362p2;
        this.f13306c = cVar;
        this.f13307d = new p248z6.c(context, new e(new b(13, this)));
    }

    @Override // E2.InterfaceC0143q0
    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        j.e(motionEvent, "e");
        if (((GestureDetector) this.f13307d.f24847s).onTouchEvent(motionEvent)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 3 && motionEvent.getActionMasked() != 1) {
            return false;
        }
        this.f13306c.e(X3.e.f9936a);
        return false;
    }

    @Override // E2.InterfaceC0143q0
    public final void c(MotionEvent motionEvent) {
    }

    @Override // E2.InterfaceC0143q0
    public final void e(boolean z10) {
    }
}
