package j$.util.function;

import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f18159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f18160c;

    public /* synthetic */ d(Function function, Function function2, int i10) {
        this.f18158a = i10;
        this.f18159b = function;
        this.f18160c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f18158a) {
            case 0:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f18158a) {
            case 0:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f18158a) {
            case 0:
                return this.f18160c.apply(this.f18159b.apply(obj));
            default:
                return this.f18159b.apply(this.f18160c.apply(obj));
        }
    }
}
