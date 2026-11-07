package j$.util.stream;

import java.util.stream.Collector;

/* JADX INFO: renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1118i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collector f18479a;

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f18479a;
        if (obj instanceof C1118i) {
            obj = ((C1118i) obj).f18479a;
        }
        return collector.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18479a.hashCode();
    }
}
