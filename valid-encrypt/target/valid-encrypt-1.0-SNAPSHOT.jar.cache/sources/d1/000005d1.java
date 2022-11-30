package fit.ome;

/* loaded from: valid-encrypt-1.0-SNAPSHOT.jar:BOOT-INF/lib/common-lib-1.0-SNAPSHOT.jar:fit/ome/RealSrv.class */
public class RealSrv implements IService {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // fit.ome.IService
    public java.lang.String realName() {
        /*
            r2 = this;
            r0 = 0
            return r0
        L2:
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: fit.ome.RealSrv.realName():java.lang.String");
    }

    @Override // fit.ome.IService
    public int cal() {
        return 0;
    }
}