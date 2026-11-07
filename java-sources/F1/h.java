package F1;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2167e;

    public /* synthetic */ h(String str, Context context, Object obj, int i10, int i11) {
        this.f2163a = i11;
        this.f2164b = str;
        this.f2165c = context;
        this.f2167e = obj;
        this.f2166d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f2163a;
        int i11 = this.f2166d;
        Object obj = this.f2167e;
        Context context = this.f2165c;
        String str = this.f2164b;
        switch (i10) {
            case 0:
                Object[] objArr = {(g) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return k.b(str, context, DesugarCollections.unmodifiableList(arrayList), i11);
            default:
                try {
                    return k.b(str, context, (List) obj, i11);
                } catch (Throwable unused) {
                    return new j(-3);
                }
        }
    }
}
