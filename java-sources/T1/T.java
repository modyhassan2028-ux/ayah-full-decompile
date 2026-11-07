package T1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes.dex */
public final class T extends q9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public S9.c f7628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FileInputStream f7629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public FileLock f7630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f7632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ U f7633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7634x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u8, q9.c cVar) {
        super(cVar);
        this.f7633w = u8;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f7632v = obj;
        this.f7634x |= Integer.MIN_VALUE;
        return this.f7633w.a(null, this);
    }
}
