# network-flow-algorithm
Algorithm for finding maximum network flow using directed graph data structure

Suppose our network contains one source node s and one target node t. We say that a flow from s to t is a function 𝒇 that maps each edge 𝒆 to a nonnegative real number 𝒇(𝒆), the amount of flow along edge 𝒆. A flow 𝒇 must satisfy two properties:

(1) Capacity conditions: For each edge 𝒆 ∈ 𝑬, we have 𝟎 ≤ 𝒇(𝒆) ≤ 𝒄(𝒆).

(2) Conservation conditions: For each node v except s and t, we have
**∑𝒆∈𝒊𝒏(𝒗) 𝒇(𝒆) = ∑𝒆∈𝒐𝒖𝒕(𝒗)** 𝒇(𝒆) where 𝑖𝑛(𝒗) and 𝑜𝑢𝑡(𝒗) are the sets in edges into
and out of 𝒗, respectively.
