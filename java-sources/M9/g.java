package M9;

import K9.InterfaceC0388f;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f5854a = new m(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f5855b = P9.b.l("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f5856c = P9.b.l("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P9.t f5857d = new P9.t("BUFFERED", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final P9.t f5858e = new P9.t("SHOULD_BUFFER", 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final P9.t f5859f = new P9.t("S_RESUMING_BY_RCV", 0);
    public static final P9.t g = new P9.t("RESUMING_BY_EB", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final P9.t f5860h = new P9.t("POISONED", 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final P9.t f5861i = new P9.t("DONE_RCV", 0);
    public static final P9.t j = new P9.t("INTERRUPTED_SEND", 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final P9.t f5862k = new P9.t("INTERRUPTED_RCV", 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final P9.t f5863l = new P9.t("CHANNEL_CLOSED", 0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final P9.t f5864m = new P9.t("SUSPEND", 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final P9.t f5865n = new P9.t("SUSPEND_NO_WAITER", 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final P9.t f5866o = new P9.t("FAILED", 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final P9.t f5867p = new P9.t("NO_RECEIVE_RESULT", 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final P9.t f5868q = new P9.t("CLOSE_HANDLER_CLOSED", 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final P9.t f5869r = new P9.t("CLOSE_HANDLER_INVOKED", 0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final P9.t f5870s = new P9.t("NO_CLOSE_CAUSE", 0);

    public static final boolean a(InterfaceC0388f interfaceC0388f, Object obj, p241y9.f fVar) {
        P9.t tVarJ = interfaceC0388f.j(obj, fVar);
        if (tVarJ == null) {
            return false;
        }
        interfaceC0388f.l(tVarJ);
        return true;
    }
}
