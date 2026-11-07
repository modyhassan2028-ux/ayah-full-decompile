package p174r3;

import com.ayah.common.data.source.json.model.booklist.BookType;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public BookType f21529r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f21530s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f21531t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21532u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, c cVar) {
        super(cVar);
        this.f21531t = lVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        this.f21530s = obj;
        this.f21532u |= Integer.MIN_VALUE;
        return this.f21531t.c(null, this);
    }
}
