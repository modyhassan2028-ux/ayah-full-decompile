package K0;

import D0.C0086d;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4883r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f4884s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(E e10, int i10) {
        super(1);
        this.f4883r = i10;
        this.f4884s = e10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f4883r) {
            case 0:
                E e10 = this.f4884s;
                return Boolean.valueOf(e10.f4902d.getParent().requestSendAccessibilityEvent(e10.f4902d, (AccessibilityEvent) obj));
            default:
                U0 u8 = (U0) obj;
                if (u8.f5017s.contains(u8)) {
                    E e11 = this.f4884s;
                    e11.f4902d.getSnapshotObserver().a(u8, e11.f4901O, new C0086d(14, u8, e11));
                }
                return p110k9.y.f19095a;
        }
    }
}
