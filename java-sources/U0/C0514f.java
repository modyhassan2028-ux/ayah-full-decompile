package U0;

import java.util.Comparator;
import p185s8.u0;

/* JADX INFO: renamed from: U0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0514f implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8058a;

    public /* synthetic */ C0514f(int i10) {
        this.f8058a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8058a) {
            case 0:
                break;
        }
        return u0.i(Integer.valueOf(((C0513e) obj).f8055b), Integer.valueOf(((C0513e) obj2).f8055b));
    }
}
