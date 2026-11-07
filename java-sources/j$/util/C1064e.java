package j$.util;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1064e implements java.util.Comparator, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f18147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18148c;

    public /* synthetic */ C1064e(java.util.Comparator comparator, Object obj, int i10) {
        this.f18146a = i10;
        this.f18147b = comparator;
        this.f18148c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f18146a) {
            case 0:
                java.util.Comparator comparator = this.f18147b;
                java.util.Comparator comparator2 = (java.util.Comparator) this.f18148c;
                int iCompare = comparator.compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
            default:
                java.util.Comparator comparator3 = this.f18147b;
                Function function = (Function) this.f18148c;
                return comparator3.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
