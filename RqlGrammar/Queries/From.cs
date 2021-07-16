namespace RqlGrammar.Model
{
    public enum FromType
    {
        COLLECTION,
        INDEX,
        ALL_DOCS
    };
    public class From
    {
        public FromType FromType { get; set; }
        public string CollectionIdentifier { get; set; }
        
    }
}
