package D0;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class B extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1043r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C f1044s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(C c10, int i10) {
        super(1);
        this.f1043r = i10;
        this.f1044s = c10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f1043r) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                D d5 = this.f1044s.f1045a;
                if (d5 != null) {
                    d5.e(motionEvent);
                    return p110k9.y.f19095a;
                }
                p251z9.j.k("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                D d9 = this.f1044s.f1045a;
                if (d9 != null) {
                    d9.e(motionEvent2);
                    return p110k9.y.f19095a;
                }
                p251z9.j.k("onTouchEvent");
                throw null;
        }
    }
}
